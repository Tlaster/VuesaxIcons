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

public val BulkGroup.Import2: ImageVector
    get() {
        if (_import2 != null) {
            return _import2!!
        }
        _import2 = Builder(name = "Import2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 17.5f)
                horizontalLineTo(12.58f)
                curveTo(12.99f, 17.5f, 13.33f, 17.16f, 13.33f, 16.75f)
                curveTo(13.33f, 16.34f, 12.99f, 16.0f, 12.58f, 16.0f)
                horizontalLineTo(9.56f)
                lineTo(17.28f, 8.28f)
                curveTo(17.57f, 7.99f, 17.57f, 7.51f, 17.28f, 7.22f)
                curveTo(17.13f, 7.07f, 16.94f, 7.0f, 16.75f, 7.0f)
                curveTo(16.56f, 7.0f, 16.37f, 7.07f, 16.22f, 7.22f)
                lineTo(8.5f, 14.94f)
                verticalLineTo(11.92f)
                curveTo(8.5f, 11.51f, 8.16f, 11.17f, 7.75f, 11.17f)
                curveTo(7.34f, 11.17f, 7.0f, 11.51f, 7.0f, 11.92f)
                verticalLineTo(16.75f)
                curveTo(7.0f, 17.16f, 7.34f, 17.5f, 7.75f, 17.5f)
                close()
            }
        }
        .build()
        return _import2!!
    }

private var _import2: ImageVector? = null
