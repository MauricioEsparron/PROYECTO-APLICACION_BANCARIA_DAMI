package com.example.aplicacionbancaria;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/aplicacionbancaria/BancoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/aplicacionbancaria/BancoAdapter$MyViewHolder;", "clienteList", "Ljava/util/ArrayList;", "Lcom/example/aplicacionbancaria/Cliente;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class BancoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.aplicacionbancaria.BancoAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.aplicacionbancaria.Cliente> clienteList = null;
    
    public BancoAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.aplicacionbancaria.Cliente> clienteList) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.aplicacionbancaria.BancoAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.aplicacionbancaria.BancoAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/aplicacionbancaria/BancoAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "apellido", "Landroid/widget/TextView;", "getApellido", "()Landroid/widget/TextView;", "direccion", "getDireccion", "dni", "getDni", "nombre", "getNombre", "telefono", "getTelefono", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView nombre = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView apellido = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView dni = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView telefono = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView direccion = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getNombre() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getApellido() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDni() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTelefono() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDireccion() {
            return null;
        }
    }
}