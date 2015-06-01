package com.alee.laf.menu;

import com.alee.extended.painter.AdaptivePainter;
import com.alee.extended.painter.Painter;

import javax.swing.*;

/**
 * Simple MenuItemPainter adapter class.
 * It is used to install simple non-specific painters into WebMenuItemUI.
 *
 * @author Alexandr Zernov
 */

public class AdaptiveMenuItemPainter<E extends JMenuItem, U extends WebMenuItemUI> extends AdaptivePainter<E, U>
        implements MenuItemPainter<E, U>
{
    /**
     * Constructs new AdaptiveMenuItemPainter for the specified painter.
     *
     * @param painter painter to adapt
     */
    public AdaptiveMenuItemPainter ( final Painter painter )
    {
        super ( painter );
    }
}