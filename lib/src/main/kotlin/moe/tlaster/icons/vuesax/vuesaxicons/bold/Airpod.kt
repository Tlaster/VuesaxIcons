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

public val BoldGroup.Airpod: ImageVector
    get() {
        if (_airpod != null) {
            return _airpod!!
        }
        _airpod = Builder(name = "Airpod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.08f, 11.3419f)
                horizontalLineTo(8.92f)
                curveTo(8.28f, 11.3419f, 7.65f, 11.0819f, 7.2f, 10.6219f)
                curveTo(7.06f, 10.4819f, 6.94f, 10.3319f, 6.84f, 10.1619f)
                curveTo(6.66f, 9.8619f, 6.34f, 9.6719f, 5.99f, 9.6719f)
                horizontalLineTo(3.5f)
                curveTo(2.95f, 9.6719f, 2.5f, 10.1219f, 2.5f, 10.6719f)
                verticalLineTo(17.5019f)
                curveTo(2.5f, 19.9919f, 4.51f, 22.0019f, 7.0f, 22.0019f)
                horizontalLineTo(17.0f)
                curveTo(19.49f, 22.0019f, 21.5f, 19.9919f, 21.5f, 17.5019f)
                verticalLineTo(10.6719f)
                curveTo(21.5f, 10.1219f, 21.05f, 9.6719f, 20.5f, 9.6719f)
                horizontalLineTo(18.0f)
                curveTo(17.64f, 9.6719f, 17.32f, 9.8719f, 17.14f, 10.1819f)
                curveTo(16.72f, 10.8719f, 15.95f, 11.3419f, 15.08f, 11.3419f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(4.51f, 2.0f, 2.5f, 4.01f, 2.5f, 6.5f)
                verticalLineTo(7.17f)
                curveTo(2.5f, 7.72f, 2.95f, 8.17f, 3.5f, 8.17f)
                horizontalLineTo(6.0f)
                curveTo(6.36f, 8.17f, 6.68f, 7.97f, 6.86f, 7.66f)
                curveTo(7.28f, 6.97f, 8.05f, 6.5f, 8.92f, 6.5f)
                horizontalLineTo(14.91f)
                curveTo(15.52f, 6.5f, 16.4f, 6.82f, 16.82f, 7.25f)
                curveTo(16.95f, 7.38f, 17.05f, 7.52f, 17.15f, 7.67f)
                curveTo(17.33f, 7.97f, 17.65f, 8.17f, 18.01f, 8.17f)
                horizontalLineTo(20.51f)
                curveTo(21.06f, 8.17f, 21.51f, 7.72f, 21.51f, 7.17f)
                verticalLineTo(6.5f)
                curveTo(21.5f, 4.01f, 19.49f, 2.0f, 17.0f, 2.0f)
                close()
            }
        }
        .build()
        return _airpod!!
    }

private var _airpod: ImageVector? = null
