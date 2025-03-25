class SDLCConcreteBuilder implements SDLCBuilder {
    String requirements;
    String design;
    String development;
    String testing;
    String deployment;

    @Override
    public void setRequirements(String requirements) {
        this.requirements = requirements;
       
    }

    @Override
    public void setDesign(String design) {
        this.design = design;
        
    }

    @Override
    public void setDevelopment(String development) {
        this.development = development;
        
    }

    @Override
    public void setTesting(String testing) {
        this.testing = testing;
        
    }

    @Override
    public void setDeployment(String deployment) {
        this.deployment = deployment;
        
    }

    @Override
    public SoftwareProject build() {
        return new SoftwareProject(requirements,design,deployment,testing,deployment);
    }
}