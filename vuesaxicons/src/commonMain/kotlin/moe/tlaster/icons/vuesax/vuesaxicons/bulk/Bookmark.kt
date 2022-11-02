package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val BulkGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.82f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.82f, 4.17f, 21.99f, 7.81f, 21.99f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 21.99f, 21.99f, 19.82f, 21.99f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.25f, 2.0002f)
                verticalLineTo(12.42f)
                curveTo(16.25f, 13.06f, 16.06f, 13.54f, 15.73f, 13.73f)
                curveTo(15.39f, 13.93f, 14.85f, 13.83f, 14.25f, 13.47f)
                lineTo(12.93f, 12.68f)
                curveTo(12.42f, 12.37f, 11.58f, 12.37f, 11.07f, 12.68f)
                lineTo(9.75f, 13.47f)
                curveTo(9.15f, 13.83f, 8.61f, 13.92f, 8.27f, 13.73f)
                curveTo(7.94f, 13.54f, 7.75f, 13.06f, 7.75f, 12.42f)
                verticalLineTo(2.0003f)
                curveTo(7.7733f, 2.0001f, 7.7966f, 2.0f, 7.82f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(16.21f, 2.0f, 16.23f, 2.0001f, 16.25f, 2.0002f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
