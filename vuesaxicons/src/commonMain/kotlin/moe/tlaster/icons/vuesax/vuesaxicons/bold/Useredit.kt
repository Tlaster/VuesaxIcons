package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Useredit: ImageVector
    get() {
        if (_useredit != null) {
            return _useredit!!
        }
        _useredit = Builder(name = "Useredit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.24f, 2.0f, 7.0f, 4.24f, 7.0f, 7.0f)
                curveTo(7.0f, 9.76f, 9.24f, 12.0f, 12.0f, 12.0f)
                curveTo(14.76f, 12.0f, 17.0f, 9.76f, 17.0f, 7.0f)
                curveTo(17.0f, 4.24f, 14.76f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.17f, 6.51f)
                lineTo(11.47f, 9.21f)
                curveTo(11.37f, 9.31f, 11.16f, 9.41f, 11.02f, 9.44f)
                lineTo(9.99f, 9.58f)
                curveTo(9.61f, 9.63f, 9.35f, 9.37f, 9.41f, 9.0f)
                lineTo(9.56f, 7.97f)
                curveTo(9.58f, 7.83f, 9.68f, 7.62f, 9.79f, 7.52f)
                lineTo(12.49f, 4.82f)
                curveTo(12.95f, 4.36f, 13.5f, 4.14f, 14.18f, 4.82f)
                curveTo(14.85f, 5.51f, 14.63f, 6.05f, 14.17f, 6.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 14.0f)
                curveTo(6.9902f, 14.0f, 2.9102f, 17.36f, 2.9102f, 21.5f)
                curveTo(2.9102f, 21.78f, 3.1302f, 22.0f, 3.4102f, 22.0f)
                horizontalLineTo(20.5902f)
                curveTo(20.8702f, 22.0f, 21.0902f, 21.78f, 21.0902f, 21.5f)
                curveTo(21.0902f, 17.36f, 17.0102f, 14.0f, 12.0002f, 14.0f)
                close()
            }
        }
        .build()
        return _useredit!!
    }

private var _useredit: ImageVector? = null
