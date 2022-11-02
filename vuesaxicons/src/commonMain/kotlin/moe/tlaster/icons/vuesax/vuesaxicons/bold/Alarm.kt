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

public val BoldGroup.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.25f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 10.03f, 16.97f, 6.0f, 12.0f, 6.0f)
                curveTo(7.03f, 6.0f, 3.0f, 10.03f, 3.0f, 15.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22.0f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 22.75f, 22.75f, 22.41f, 22.75f, 22.0f)
                curveTo(22.75f, 21.59f, 22.41f, 21.25f, 22.0f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.75f)
                curveTo(11.59f, 3.75f, 11.25f, 3.41f, 11.25f, 3.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12.0f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(12.75f, 3.41f, 12.41f, 3.75f, 12.0f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0014f, 5.7514f)
                curveTo(4.8114f, 5.7514f, 4.6214f, 5.6814f, 4.4714f, 5.5314f)
                lineTo(3.4714f, 4.5314f)
                curveTo(3.1814f, 4.2414f, 3.1814f, 3.7614f, 3.4714f, 3.4714f)
                curveTo(3.7614f, 3.1814f, 4.2414f, 3.1814f, 4.5314f, 3.4714f)
                lineTo(5.5314f, 4.4714f)
                curveTo(5.8214f, 4.7614f, 5.8214f, 5.2414f, 5.5314f, 5.5314f)
                curveTo(5.3814f, 5.6814f, 5.1914f, 5.7514f, 5.0014f, 5.7514f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0014f, 5.7514f)
                curveTo(18.8114f, 5.7514f, 18.6214f, 5.6814f, 18.4714f, 5.5314f)
                curveTo(18.1814f, 5.2414f, 18.1814f, 4.7614f, 18.4714f, 4.4714f)
                lineTo(19.4714f, 3.4714f)
                curveTo(19.7614f, 3.1814f, 20.2414f, 3.1814f, 20.5314f, 3.4714f)
                curveTo(20.8214f, 3.7614f, 20.8214f, 4.2414f, 20.5314f, 4.5314f)
                lineTo(19.5314f, 5.5314f)
                curveTo(19.3814f, 5.6814f, 19.1914f, 5.7514f, 19.0014f, 5.7514f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
