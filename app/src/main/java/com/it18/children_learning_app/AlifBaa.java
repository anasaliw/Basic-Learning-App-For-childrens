package com.it18.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AlifBaa extends AppCompatActivity {
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa,bb,cc,dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alif_baa);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        e=findViewById(R.id.e);
        f=findViewById(R.id.f);
        g=findViewById(R.id.g);
        h=findViewById(R.id.h);
        i=findViewById(R.id.i);
        j=findViewById(R.id.j);
        k=findViewById(R.id.k);
        l=findViewById(R.id.l);
        m=findViewById(R.id.m);
        n=findViewById(R.id.n);
        o=findViewById(R.id.o);
        p=findViewById(R.id.p);
        q=findViewById(R.id.q);
        r=findViewById(R.id.r);
        s=findViewById(R.id.s);
        t=findViewById(R.id.t);
        u=findViewById(R.id.u);
        v=findViewById(R.id.v);
        w=findViewById(R.id.w);
        x=findViewById(R.id.x);
        y=findViewById(R.id.y);
        z=findViewById(R.id.z);
        aa=findViewById(R.id.aa);
        bb=findViewById(R.id.bb);
        cc=findViewById(R.id.cc);
        dd=findViewById(R.id.dd);


        //Setting On Click listner
        a.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), alif.class);
            startActivity(a);
        });
        b.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), baa.class);
            startActivity(a);
        });
        c.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), taa.class);
            startActivity(a);
        });
        d.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), saa.class);
            startActivity(a);
        });
        e.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), jeem.class);
            startActivity(a);
        });
        f.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), haa.class);
            startActivity(a);
        });
        g.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), khaa.class);
            startActivity(a);
        });
        h.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), daa.class);
            startActivity(a);
        });
        i.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), zuad.class);
            startActivity(a);
        });
        j.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), ree.class);
            startActivity(a);
        });
        k.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), zee.class);
            startActivity(a);
        });
        l.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), seen.class);
            startActivity(a);
        });
        m.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), sheen.class);
            startActivity(a);
        });
        n.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), soen.class);
            startActivity(a);
        });
        o.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), zoen.class);
            startActivity(a);
        });
        p.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), toen.class);
            startActivity(a);
        });
        q.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), zaa.class);
            startActivity(a);
        });
        r.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), aeeen.class);
            startActivity(a);
        });
        s.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), gaeen.class);
            startActivity(a);
        });
        t.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), faa.class);
            startActivity(a);
        });
        u.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), kaaf.class);
            startActivity(a);
        });
        v.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), kawf.class);
            startActivity(a);
        });
        w.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), laam.class);
            startActivity(a);
        });
        x.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), meem.class);
            startActivity(a);
        });
        y.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), noon.class);
            startActivity(a);
        });
        z.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), wow.class);
            startActivity(a);
        });
        aa.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(),haa_alif.class);
            startActivity(a);
        });
        bb.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), lam_alif.class);
            startActivity(a);
        });
        cc.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), hamza.class);
            startActivity(a);
        });
        dd.setOnClickListener(v->{
            Intent a=new Intent(getApplicationContext(), yaa.class);
            startActivity(a);
        });
    }
}