interface SDLCBuilder {
    void setRequirements(String requirements);
    void setDesign(String design);
    void setDevelopment(String development);
    void setTesting(String testing);
    void setDeployment(String deployment);
    SoftwareProject build();
}