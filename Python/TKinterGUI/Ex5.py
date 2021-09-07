import tkinter as tk

window = tk.Tk()

ent = tk.Entry(width=40, bg='white', fg='black')
ent.pack()

ent.insert(0, "What's your name?")

window.mainloop()
