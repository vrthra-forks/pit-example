all: asm

make:
	rm -rf target/pit-reports/*
	mvn test -Ppitest
	mv target/pit-reports/* target/pit-reports/latest

asm:
	mvn compile
	javap -verbose target.classes.com.theladders.PersonFactory > a.asm
