DROP TABLE IF EXISTS "transactions";

CREATE SEQUENCE transaction_id_sequence;

CREATE TABLE "transactions" (
	"transaction_id"       SERIAL,
	"account_id"           INT,
	"transaction_amount"   NUMERIC(15, 5),
	CONSTRAINT "transactions_pkey" PRIMARY KEY ("transaction_id")
);

ALTER TABLE "transactions"
ADD CONSTRAINT "transactions_account_id_fkey"
FOREIGN KEY ("account_id")
REFERENCES "accounts" ("account_id")
MATCH SIMPLE;
