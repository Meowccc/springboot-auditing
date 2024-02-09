CREATE TABLE event_log
(
    id IDENTITY PRIMARY KEY,
    event        VARCHAR(20) NOT NULL,
    service_code INT         NOT NULL,
    created_at   TIMESTAMP   NOT NULL DEFAULT current_timestamp,
    created_by   VARCHAR(50) NOT NULL DEFAULT '',
    updated_at   TIMESTAMP   NOT NULL DEFAULT current_timestamp,
    updated_by   VARCHAR(50) NOT NULL DEFAULT ''
);