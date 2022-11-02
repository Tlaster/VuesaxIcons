package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.92f)
                curveTo(17.25f, 14.0f, 16.46f, 13.52f, 16.15f, 12.93f)
                lineTo(15.11f, 10.96f)
                curveTo(14.83f, 10.43f, 14.43f, 10.46f, 14.21f, 11.01f)
                lineTo(11.91f, 16.82f)
                curveTo(11.66f, 17.47f, 11.24f, 17.47f, 10.98f, 16.82f)
                lineTo(9.84f, 13.94f)
                curveTo(9.57f, 13.24f, 8.73f, 12.67f, 7.98f, 12.67f)
                lineTo(2.0f, 12.7f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.1901f)
                verticalLineTo(14.0001f)
                horizontalLineTo(17.92f)
                curveTo(17.25f, 14.0001f, 16.46f, 13.5201f, 16.15f, 12.9301f)
                lineTo(15.11f, 10.9601f)
                curveTo(14.83f, 10.4301f, 14.43f, 10.4601f, 14.21f, 11.0101f)
                lineTo(11.91f, 16.8201f)
                curveTo(11.66f, 17.4701f, 11.24f, 17.4701f, 10.98f, 16.8201f)
                lineTo(9.84f, 13.9401f)
                curveTo(9.57f, 13.2401f, 8.73f, 12.6701f, 7.98f, 12.6701f)
                lineTo(2.0f, 12.7001f)
                verticalLineTo(16.1901f)
                curveTo(2.0f, 19.7701f, 4.1f, 21.9301f, 7.63f, 21.9901f)
                curveTo(7.74f, 22.0001f, 7.86f, 22.0001f, 7.97f, 22.0001f)
                horizontalLineTo(15.97f)
                curveTo(16.12f, 22.0001f, 16.27f, 22.0001f, 16.41f, 21.9901f)
                curveTo(19.92f, 21.9101f, 22.0f, 19.7601f, 22.0f, 16.1901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0007f, 12.7002f)
                verticalLineTo(16.0102f)
                curveTo(1.9807f, 15.6902f, 1.9707f, 15.3502f, 1.9707f, 15.0002f)
                verticalLineTo(12.7002f)
                horizontalLineTo(2.0007f)
                close()
            }
        }
        .build()
        return _health!!
    }

private var _health: ImageVector? = null
