module com.vihangpatil.java9app.impl {
    requires java.base;
    requires com.vihangpatil.java9app.api;
    requires transitive mail;
    exports com.vihangpatil.java9app.impl;
}