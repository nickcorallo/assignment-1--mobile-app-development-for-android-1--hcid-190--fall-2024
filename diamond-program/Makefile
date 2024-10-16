filename = diamond
all: compile run
compile:
	kotlinc $(filename).kt -include-runtime -d $(filename).jar

run:
	java -jar $(filename).jar

clean:
	rm  $(filename).jar
