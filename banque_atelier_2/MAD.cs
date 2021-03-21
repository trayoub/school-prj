﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace banque
{
    class MAD
    {
        private double valeur;
        public MAD(double v)
        {
            this.valeur = v;
            
        }
        public static MAD operator +(MAD s1,MAD s2)
        {
            MAD s = new MAD(s1.valeur + s2.valeur);
            return s;
        }
        public static MAD operator -(MAD s1, MAD s2)
        { 
            MAD s = new MAD(s1.valeur - s2.valeur);
            return s;
        }
        public static bool operator >=(MAD s1, MAD s2)
        {
    
                return s1.valeur >= s2.valeur;
           
        }
        public static bool operator <=(MAD s1, MAD s2)
        {
                return s1.valeur <= s2.valeur;
           
            
        }
        public static double operator *(MAD s, double somme)
        {
            return (s.valeur * somme);

        }
        public void afficher()
        {
            Console.WriteLine("Le solde est " + valeur + " MAD");
        }


    }
}
