
# parsetab.py
# This file is automatically generated. Do not edit.
_tabversion = '3.8'

_lr_method = 'LALR'

_lr_signature = '020F90AECCD655BB919735A1B81EEC43'
    
_lr_action_items = {'YANG':([0,],[4,]),'KIM':([0,],[2,]),'$end':([1,2,3,4,5,],[0,-4,-1,-3,-2,]),}

_lr_action = {}
for _k, _v in _lr_action_items.items():
   for _x,_y in zip(_v[0],_v[1]):
      if not _x in _lr_action:  _lr_action[_x] = {}
      _lr_action[_x][_k] = _y
del _lr_action_items

_lr_goto_items = {'start':([0,],[1,]),'yang':([0,],[3,]),'kim':([0,],[5,]),}

_lr_goto = {}
for _k, _v in _lr_goto_items.items():
   for _x, _y in zip(_v[0], _v[1]):
       if not _x in _lr_goto: _lr_goto[_x] = {}
       _lr_goto[_x][_k] = _y
del _lr_goto_items
_lr_productions = [
  ("S' -> start","S'",1,None,None,None),
  ('start -> yang','start',1,'p_start','FredParse.py',29),
  ('start -> kim','start',1,'p_start','FredParse.py',30),
  ('yang -> YANG','yang',1,'p_yang','FredParse.py',34),
  ('kim -> KIM','kim',1,'p_kim','FredParse.py',38),
]
