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

public val OutlineGroup.Textblock: ImageVector
    get() {
        if (_textblock != null) {
            return _textblock!!
        }
        _textblock = Builder(name = "Textblock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0005f, 9.63f)
                curveTo(6.7305f, 9.63f, 6.4605f, 9.48f, 6.3305f, 9.22f)
                curveTo(6.1405f, 8.85f, 6.2905f, 8.4f, 6.6605f, 8.21f)
                curveTo(10.0005f, 6.54f, 13.9905f, 6.54f, 17.3305f, 8.21f)
                curveTo(17.7005f, 8.4f, 17.8505f, 8.85f, 17.6705f, 9.22f)
                curveTo(17.4805f, 9.59f, 17.0405f, 9.74f, 16.6605f, 9.56f)
                curveTo(13.7405f, 8.1f, 10.2505f, 8.1f, 7.3305f, 9.56f)
                curveTo(7.2305f, 9.61f, 7.1105f, 9.63f, 7.0005f, 9.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0402f)
                curveTo(11.59f, 17.0402f, 11.25f, 16.7002f, 11.25f, 16.2902f)
                verticalLineTo(7.9302f)
                curveTo(11.25f, 7.5202f, 11.59f, 7.1802f, 12.0f, 7.1802f)
                curveTo(12.41f, 7.1802f, 12.75f, 7.5202f, 12.75f, 7.9302f)
                verticalLineTo(16.3002f)
                curveTo(12.75f, 16.7102f, 12.41f, 17.0402f, 12.0f, 17.0402f)
                close()
            }
        }
        .build()
        return _textblock!!
    }

private var _textblock: ImageVector? = null
