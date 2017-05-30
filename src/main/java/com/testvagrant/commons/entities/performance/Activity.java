/*
 * Copyright (c) 2017.  TestVagrant Technologies
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.testvagrant.commons.entities.performance;

public class Activity {
    private String focussedActivity;
    private int interval;

    public String getFocussedActivity() {
        return focussedActivity;
    }

    public void setFocussedActivity(String focussedActivity) {
        this.focussedActivity = focussedActivity;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
