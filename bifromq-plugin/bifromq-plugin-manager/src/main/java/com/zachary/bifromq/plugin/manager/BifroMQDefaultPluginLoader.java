package com.zachary.bifromq.plugin.manager;

import org.pf4j.DefaultPluginLoader;
import org.pf4j.PluginClassLoader;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginManager;

import java.nio.file.Path;

class BifroMQDefaultPluginLoader extends DefaultPluginLoader {
    public BifroMQDefaultPluginLoader(PluginManager pluginManager) {
        super(pluginManager);
    }

    @Override
    protected PluginClassLoader createPluginClassLoader(Path pluginPath, PluginDescriptor pluginDescriptor) {
        return new BifroMQPluginClassLoader(pluginManager, pluginDescriptor, getClass().getClassLoader());
    }
}
