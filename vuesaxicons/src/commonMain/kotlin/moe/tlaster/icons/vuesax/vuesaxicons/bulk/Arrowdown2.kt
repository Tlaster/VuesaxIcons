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

public val BulkGroup.Arrowdown2: ImageVector
    get() {
        if (_arrowdown2 != null) {
            return _arrowdown2!!
        }
        _arrowdown2 = Builder(name = "Arrowdown2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.18f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(22.0f, 19.82f, 19.83f, 21.99f, 16.19f, 21.99f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22.0f, 2.0f, 19.83f, 2.0f, 16.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4704f, 18.53f)
                lineTo(7.1804f, 14.24f)
                curveTo(6.8904f, 13.95f, 6.8904f, 13.47f, 7.1804f, 13.18f)
                curveTo(7.4704f, 12.89f, 7.9504f, 12.89f, 8.2404f, 13.18f)
                lineTo(11.2504f, 16.19f)
                verticalLineTo(6.0f)
                curveTo(11.2504f, 5.59f, 11.5904f, 5.25f, 12.0004f, 5.25f)
                curveTo(12.4104f, 5.25f, 12.7504f, 5.59f, 12.7504f, 6.0f)
                verticalLineTo(16.19f)
                lineTo(15.7604f, 13.18f)
                curveTo(16.0504f, 12.89f, 16.5304f, 12.89f, 16.8204f, 13.18f)
                curveTo(16.9704f, 13.33f, 17.0404f, 13.52f, 17.0404f, 13.71f)
                curveTo(17.0404f, 13.9f, 16.9704f, 14.09f, 16.8204f, 14.24f)
                lineTo(12.5304f, 18.53f)
                curveTo(12.3904f, 18.67f, 12.2004f, 18.75f, 12.0004f, 18.75f)
                curveTo(11.8004f, 18.75f, 11.6104f, 18.67f, 11.4704f, 18.53f)
                close()
            }
        }
        .build()
        return _arrowdown2!!
    }

private var _arrowdown2: ImageVector? = null
