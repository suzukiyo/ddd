CREATE DATABASE auth;
CREATE DATABASE introduction;

CREATE USER apiuser IDENTIFIED BY 'apiuser';

GRANT ALL PRIVILEGES ON introduction.* TO apiuser;
GRANT ALL PRIVILEGES ON auth.* TO apiuser;