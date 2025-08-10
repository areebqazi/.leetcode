select t1.student_id , t1.student_name , t1.subject_name , 
COALESCE(t2.attended_exams, 0) AS attended_exams 
from
(
    SELECT s.student_id, s.student_name, sub.subject_name
    FROM Students s
    CROSS JOIN Subjects sub
) t1
left join
(
    select student_id , e.subject_name , count(e.subject_name) as attended_exams
    from Examinations e
    group by subject_name , student_id 
) t2
on t1.student_id = t2.student_id and t1.subject_name = t2.subject_name
order by student_id , student_name ,subject_name ,  attended_exams DESC

