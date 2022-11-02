package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Timer1: ImageVector
    get() {
        if (_timer1 != null) {
            return _timer1!!
        }
        _timer1 = Builder(name = "Timer1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.76f, 22.75f, 2.5f, 18.49f, 2.5f, 13.25f)
                curveTo(2.5f, 8.01f, 6.76f, 3.75f, 12.0f, 3.75f)
                curveTo(17.24f, 3.75f, 21.5f, 8.01f, 21.5f, 13.25f)
                curveTo(21.5f, 18.49f, 17.24f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 5.25f)
                curveTo(7.59f, 5.25f, 4.0f, 8.84f, 4.0f, 13.25f)
                curveTo(4.0f, 17.66f, 7.59f, 21.25f, 12.0f, 21.25f)
                curveTo(16.41f, 21.25f, 20.0f, 17.66f, 20.0f, 13.25f)
                curveTo(20.0f, 8.84f, 16.41f, 5.25f, 12.0f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12.0f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.75f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 2.75f, 8.25f, 2.41f, 8.25f, 2.0f)
                curveTo(8.25f, 1.59f, 8.59f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2.0f)
                curveTo(15.75f, 2.41f, 15.41f, 2.75f, 15.0f, 2.75f)
                close()
            }
        }
        .build()
        return _timer1!!
    }

private var _timer1: ImageVector? = null
