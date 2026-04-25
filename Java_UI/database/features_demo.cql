CREATE INDEX ON complaints(status);

UPDATE complaints
SET status = 'resolved'
WHERE student_id = 1 AND complaint_id = 1;

ALTER TABLE complaints ADD tags LIST<TEXT>;

UPDATE complaints
SET tags = ['urgent', 'water']
WHERE student_id = 1 AND complaint_id = 1;

UPDATE complaint_counter
SET total_complaints = total_complaints + 1
WHERE student_id = 1;

INSERT INTO complaints (complaint_id, student_id, issue, status, created_at)
VALUES (5, 1, 'Test TTL', 'pending', toTimestamp(now()))
USING TTL 120;