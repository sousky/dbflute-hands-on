%~d0
cd %~p0

.\mysql\bin\mysqladmin --defaults-file=.\my.cnf -u root --port 43376 shutdown

pause