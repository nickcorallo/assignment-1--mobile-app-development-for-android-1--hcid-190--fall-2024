filename = matrix
all: complie run
compile:
	kotlinc $(filename).kt -inclide-runtime -d $(filename).jar

	run:
		java -jar $(filename).jar

	clean:
		rm $(filename).jar

