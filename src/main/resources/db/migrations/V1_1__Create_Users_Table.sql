DROP TABLE IF EXISTS "users";

CREATE SEQUENCE user_id_sequence;

CREATE TABLE "users" (
	"user_id"    	        SERIAL,
	"account_holder_name"   VARCHAR(36),
	CONSTRAINT "users_pkey" PRIMARY KEY ("user_id")
);
