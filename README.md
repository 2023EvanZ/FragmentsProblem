# FragmentsProblem
I wanted to be able to add numerous fragments dynamically. When the button in the MainActivity is pressed, a new fragment would be added into the FrameLayout. However,
just calling ft.add() replaces the current fragment; my goal was to display a list of fragments side by side, like in Lab06 with the ViewPagers.  My original idea was to crate
a linear layout in the main activity.xml file, then dynamically add FrameLayouts to the linear layout, then add one fragment into each FrameLayout, thus displaying all the 
fragments side by side.
