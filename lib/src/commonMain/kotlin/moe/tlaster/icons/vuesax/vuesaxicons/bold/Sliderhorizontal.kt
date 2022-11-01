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

public val BoldGroup.Sliderhorizontal: ImageVector
    get() {
        if (_sliderhorizontal != null) {
            return _sliderhorizontal!!
        }
        _sliderhorizontal = Builder(name = "Sliderhorizontal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 5.0586f)
                verticalLineTo(18.9386f)
                curveTo(3.5f, 19.3486f, 3.16f, 19.6886f, 2.75f, 19.6886f)
                curveTo(2.34f, 19.6886f, 2.0f, 19.3486f, 2.0f, 18.9386f)
                verticalLineTo(5.0586f)
                curveTo(2.0f, 4.6486f, 2.34f, 4.3086f, 2.75f, 4.3086f)
                curveTo(3.16f, 4.3086f, 3.5f, 4.6486f, 3.5f, 5.0586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0586f)
                verticalLineTo(18.9386f)
                curveTo(22.0f, 19.3486f, 21.66f, 19.6886f, 21.25f, 19.6886f)
                curveTo(20.84f, 19.6886f, 20.5f, 19.3486f, 20.5f, 18.9386f)
                verticalLineTo(5.0586f)
                curveTo(20.5f, 4.6486f, 20.84f, 4.3086f, 21.25f, 4.3086f)
                curveTo(21.66f, 4.3086f, 22.0f, 4.6486f, 22.0f, 5.0586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(17.66f, 21.25f, 19.0f, 19.91f, 19.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 4.09f, 17.66f, 2.75f, 16.0f, 2.75f)
                horizontalLineTo(8.0f)
                curveTo(6.34f, 2.75f, 5.0f, 4.09f, 5.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5.0f, 19.91f, 6.34f, 21.25f, 8.0f, 21.25f)
                close()
            }
        }
        .build()
        return _sliderhorizontal!!
    }

private var _sliderhorizontal: ImageVector? = null
