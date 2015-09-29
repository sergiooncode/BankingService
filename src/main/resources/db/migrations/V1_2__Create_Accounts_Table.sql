DROP TABLE IF EXISTS "accounts";

CREATE SEQUENCE account_id_sequence;

CREATE TABLE "accounts" (
	"account_id"	        SERIAL,
	"user_id"               INT,
	"account_holder_name"   VARCHAR(36),
	"account_balance"	NUMERIC(15, 5),
	CONSTRAINT "accounts_pkey" PRIMARY KEY ("account_id")
);

ALTER TABLE "accounts"
ADD CONSTRAINT "accounts_user_id_fkey"
FOREIGN KEY ("user_id")
REFERENCES "users" ("user_id")
MATCH SIMPLE;
