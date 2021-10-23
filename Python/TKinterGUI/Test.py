import tkinter as tk
from random import randint


def roll():
    a = randint(1, 6)
    lbl_value["text"] = f"{a}"


window = tk.Tk()

frm_frame = tk.Frame(master=window, relief=tk.RAISED, borderwidth=3)
frm_frame.pack(fill=tk.BOTH)

btn_roll = tk.Button(master=frm_frame, text="Roll me!", command=roll)
btn_roll.pack()

lbl_value = tk.Label(master=frm_frame, text="1")
lbl_value.pack()

window.mainloop()
