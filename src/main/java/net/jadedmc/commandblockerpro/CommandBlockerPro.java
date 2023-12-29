/*
 * This file is part of CommandBlockerPro, licensed under the MIT License.
 *
 *  Copyright (c) JadedMC
 *  Copyright (c) contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */
package net.jadedmc.commandblockerpro;

import net.jadedmc.commandblockerpro.rules.Rule;

import java.util.Collection;

/**
 * A collection of static methods for other plugins to interact with.
 */
@SuppressWarnings("unused")
public class CommandBlockerPro {
    private static CommandBlockerProPlugin plugin;

    /**
     *  Get all currently loaded rules.
     * @return Collection of all loaded rules.
     */
    public static Collection<Rule> getRules() {
        return plugin.ruleManager().rules();
    }

    /**
     * Passes an instance of the plugin to this static class.
     * @param pl Instance of the plugin.
     */
    protected static void setPlugin(final CommandBlockerProPlugin pl) {
        plugin = pl;
    }
}