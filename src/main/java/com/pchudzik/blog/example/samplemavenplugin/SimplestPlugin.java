package com.pchudzik.blog.example.samplemavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "greeting", defaultPhase = LifecyclePhase.INITIALIZE)
public class SimplestPlugin extends AbstractMojo {
    @Parameter(required = true)
    private String name;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello " + name);
    }
}
