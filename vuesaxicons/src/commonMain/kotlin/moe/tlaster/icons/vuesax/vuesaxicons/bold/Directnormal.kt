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

public val BoldGroup.Directnormal: ImageVector
    get() {
        if (_directnormal != null) {
            return _directnormal!!
        }
        _directnormal = Builder(name = "Directnormal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3f, 12.2305f)
                horizontalLineTo(17.82f)
                curveTo(16.84f, 12.2305f, 15.97f, 12.7705f, 15.53f, 13.6505f)
                lineTo(14.69f, 15.3105f)
                curveTo(14.49f, 15.7105f, 14.09f, 15.9605f, 13.65f, 15.9605f)
                horizontalLineTo(10.37f)
                curveTo(10.06f, 15.9605f, 9.62f, 15.8905f, 9.33f, 15.3105f)
                lineTo(8.49f, 13.6605f)
                curveTo(8.05f, 12.7905f, 7.17f, 12.2405f, 6.2f, 12.2405f)
                horizontalLineTo(2.7f)
                curveTo(2.31f, 12.2405f, 2.0f, 12.5505f, 2.0f, 12.9405f)
                verticalLineTo(16.2005f)
                curveTo(2.0f, 19.8305f, 4.18f, 22.0005f, 7.82f, 22.0005f)
                horizontalLineTo(16.2f)
                curveTo(19.63f, 22.0005f, 21.74f, 20.1205f, 22.0f, 16.7805f)
                verticalLineTo(12.9305f)
                curveTo(22.0f, 12.5505f, 21.69f, 12.2305f, 21.3f, 12.2305f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(10.85f)
                curveTo(21.78f, 10.77f, 21.54f, 10.73f, 21.3f, 10.73f)
                horizontalLineTo(17.82f)
                curveTo(16.27f, 10.73f, 14.88f, 11.59f, 14.19f, 12.97f)
                lineTo(13.44f, 14.45f)
                horizontalLineTo(10.58f)
                lineTo(9.83f, 12.98f)
                curveTo(9.14f, 11.59f, 7.75f, 10.73f, 6.2f, 10.73f)
                horizontalLineTo(2.7f)
                curveTo(2.46f, 10.73f, 2.22f, 10.77f, 2.0f, 10.85f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                close()
            }
        }
        .build()
        return _directnormal!!
    }

private var _directnormal: ImageVector? = null
