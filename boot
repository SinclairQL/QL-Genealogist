1 REMark QL Genealogist - 3
2 REMark v3.24
3 REMark  Chris Boutal & Rich Mellor
4 :
100 device$='flp1_'
102 smsqe=0:IF VER$='HBA':smsqe=1
103 IF smsqe:v$=VER$(1):IF v$(3 TO)<'60':smsqe=0
105 IF NOT smsqe
110   TK2_EXT
120   LRESPR device$&'ptr_gen'
130   LRESPR device$&'wman'
135 END IF
140 LRESPR device$&'qlib_run'
150 LRESPR device$&'G3_rext'
160 CLS #0
170 WINDOW 512,256,0,0
180 PAPER 5:INK 0:CLS
190 CSIZE 3,1
200 AT 4,12:PRINT "Loading"
210 AT 6,9:PRINT "Genealogist-3"
215 CSIZE 0,0
217 IF smsqe
220   EXEC_W device$&'G3_obj';'512x256'
225 ELSE
227   EXEC_W device$&'G3_obj'
228 END IF
230 :
240 REMark QXL and higher res users -- see below!
250 :
260 REMark EXEC_W device$&'G3_obj';'600x350'
270 REMark EXEC_W device$&'G3_obj';'800x600'
