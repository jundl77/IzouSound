package jundl77.izou.izousound;

import intellimate.izou.activator.Activator;
import intellimate.izou.addon.AddOn;
import intellimate.izou.contentgenerator.ContentGenerator;
import intellimate.izou.events.EventsController;
import intellimate.izou.output.OutputExtension;
import intellimate.izou.output.OutputPlugin;
import jundl77.izou.izousound.outputplugin.SoundOutputPlugin;
import ro.fortsoft.pf4j.Extension;

@Extension
public class SoundAddOn extends AddOn {

    @SuppressWarnings("WeakerAccess")
    public static final String ID = SoundAddOn.class.getCanonicalName();

    public SoundAddOn() {
        super(ID);
    }

    @Override
    public void prepare() {

    }

    @Override
    public Activator[] registerActivator() {
        return null;
    }

    @Override
    public ContentGenerator[] registerContentGenerator() {
        return null;
    }

    @Override
    public EventsController[] registerEventController() {
        return null;
    }

    @Override
    public OutputPlugin[] registerOutputPlugin() {
        OutputPlugin[] outputPlugins = new OutputPlugin[1];
        outputPlugins[0] = new SoundOutputPlugin(getContext());
        return outputPlugins;
    }

    @Override
    public OutputExtension[] registerOutputExtension() {
        return null;
    }

    /**
     * An ID must always be unique.
     * A Class like Activator or OutputPlugin can just provide their .class.getCanonicalName()
     * If you have to implement this interface multiple times, just concatenate unique Strings to
     * .class.getCanonicalName()
     *
     * @return A String containing an ID
     */
    @Override
    public String getID() {
        return ID;
    }
}
