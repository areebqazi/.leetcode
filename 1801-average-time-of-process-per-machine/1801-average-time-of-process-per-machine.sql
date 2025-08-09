# Write your MySQL query statement below

select d1.machine_id , ROUND(avg(processing_time),3) as processing_time 
from (
select a1.machine_id , a2.`timestamp` - a1.`timestamp` as processing_time 
from Activity a1
join Activity a2
on a1.machine_id = a2.machine_id and a1.process_id  = a2.process_id 
and a1.activity_type = 'start' and a2.activity_type='end'
) d1
group by machine_id