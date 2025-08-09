CREATE TABLE available_slot
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    start_time  DATETIME NOT NULL,
    end_time    DATETIME NOT NULL,
    is_reserved BOOLEAN DEFAULT FALSE
);

CREATE TABLE user
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    username   VARCHAR(255) NOT NULL UNIQUE,
    email      VARCHAR(255) NOT NULL UNIQUE,
    password   VARCHAR(255) NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE reservations
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id          BIGINT NOT NULL,
    slot_id          BIGINT NOT NULL,
    reservation_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    status           ENUM('CONFIRMED', 'CANCELLED') DEFAULT 'CONFIRMED',
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (slot_id) REFERENCES available_slots (id),
    UNIQUE KEY unique_slot (slot_id)
);