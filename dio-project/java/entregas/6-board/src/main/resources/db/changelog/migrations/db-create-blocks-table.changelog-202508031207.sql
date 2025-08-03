-- liquibase formatted sql
-- changeset antonio:changelog-202508031108:
-- comment: blocks table create

CREATE TABLE BLOCKS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    blocked_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    blocked_reason VARCHAR(255) NOT NULL,
    unblocked_at TIMESTAMP NULL,
    unblocked_reason VARCHAR(255) NULL,
    cards_id BIGINT NOT NULL,
    CONSTRAINT cards_blocked_at_uk UNIQUE KEY (cards_id, blocked_at),
    CONSTRAINT cards__blocks_fk FOREIGN KEY (cards_id) REFERENCES CARDS(id) ON DELETE CASCADE
) ENGINE = InnoDB;

-- rollback: DROP TABLE BLOCKS