# Write your MySQL query statement below

select 
    query_name , 
    Round(ratio/totalCount,2) as quality , 
    Round(lowRatingCount/totalCount*100,2) as poor_query_percentage 
From
(
select 
    query_name , 
    sum(rating/`position`) as ratio , 
    count(query_name) as totalCount ,
    COUNT(CASE WHEN rating < 3 THEN 1 END) AS lowRatingCount
from Queries
group by query_name
) t1