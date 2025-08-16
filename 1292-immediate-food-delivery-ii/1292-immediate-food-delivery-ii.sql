-- select 
--     Round(count(case when order_date = customer_pref_delivery_date then 1 end)/
--     count(customer_id) * 100 , 2 ) as immediate_percentage 
-- FROM 
-- (    
--     select * 
--     from 
--     (
--         select * from Delivery order by customer_id , order_date
--     ) t1
--     group by customer_id
-- ) t2

select 
Round(count(case when order_date = customer_pref_delivery_date then 1 end)/
count(customer_id) * 100 , 2 ) as immediate_percentage 
from 
(
SELECT d.*,
           ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY order_date ASC) AS rn
    FROM Delivery d
) t1
where rn = 1 