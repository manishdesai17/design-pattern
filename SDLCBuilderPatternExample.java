public class SDLCBuilderPatternExample {
    public static void main(String[] args) {
        SDLCBuilder builder = new SDLCConcreteBuilder();
        builder.setRequirements("get bissness need");
        builder.setDesign("create html page");
        builder.setDevelopment("write feacture");
        builder.setTesting("system testing");
        builder.setDeployment("deploy software");
        SoftwareProject sp=builder.build();
        System.out.println(sp.showProjectDetails());
    }
}