public class pom extends org.sonatype.maven.polyglot.java.dsl.ModelFactory {
    public void project() {
        modelVersion = "4.0.0";
        groupId = "com.dais39";
        artifactId = "sample-poliglot-maven";
        packaging = "jar";
        version = "1.0-SNAPSHOT";
        properties(
            property("project.build.sourceEncoding", "UTF-8")
        );
    }
}