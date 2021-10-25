output_path = ./output

src_path = src/main/java
jlox_path = $(src_path)/de/florianmaier/jlox
tool_path = $(src_path)/de/florianmaier/tool

build : clean compileGenerateAst generateAst

clean :
	rm -rf $(output_path)
	rm -rf $(jlox_path)/Expr.java

compileGenerateAst :
	javac -d $(output_path) $(tool_path)/GenerateAst.java

generateAst :
	java -cp $(output_path) de.florianmaier.tool.GenerateAst $(jlox_path)
