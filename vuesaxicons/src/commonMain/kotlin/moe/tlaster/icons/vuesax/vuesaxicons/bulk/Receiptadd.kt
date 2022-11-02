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

public val BulkGroup.Receiptadd: ImageVector
    get() {
        if (_receiptadd != null) {
            return _receiptadd!!
        }
        _receiptadd = Builder(name = "Receiptadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                verticalLineTo(8.42f)
                curveTo(22.0f, 10.0f, 21.0f, 11.0f, 19.42f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.01f)
                curveTo(16.0f, 2.9f, 16.91f, 2.0f, 18.02f, 2.0f)
                curveTo(19.11f, 2.01f, 20.11f, 2.45f, 20.83f, 3.17f)
                curveTo(21.55f, 3.9f, 22.0f, 4.9f, 22.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.83f, 2.94f, 22.3f, 3.6f, 21.8f)
                lineTo(5.31f, 20.52f)
                curveTo(5.71f, 20.22f, 6.27f, 20.26f, 6.63f, 20.62f)
                lineTo(8.29f, 22.29f)
                curveTo(8.68f, 22.68f, 9.32f, 22.68f, 9.71f, 22.29f)
                lineTo(11.39f, 20.61f)
                curveTo(11.74f, 20.26f, 12.3f, 20.22f, 12.69f, 20.52f)
                lineTo(14.4f, 21.8f)
                curveTo(15.06f, 22.29f, 16.0f, 21.82f, 16.0f, 21.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 2.9f, 16.9f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(7.0f)
                horizontalLineTo(6.0f)
                curveTo(3.0f, 2.0f, 2.0f, 3.79f, 2.0f, 6.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 9.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(7.25f)
                curveTo(9.75f, 6.84f, 9.41f, 6.5f, 9.0f, 6.5f)
                curveTo(8.59f, 6.5f, 8.25f, 6.84f, 8.25f, 7.25f)
                verticalLineTo(9.25f)
                horizontalLineTo(6.25f)
                curveTo(5.84f, 9.25f, 5.5f, 9.59f, 5.5f, 10.0f)
                curveTo(5.5f, 10.41f, 5.84f, 10.75f, 6.25f, 10.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(12.75f)
                curveTo(8.25f, 13.16f, 8.59f, 13.5f, 9.0f, 13.5f)
                curveTo(9.41f, 13.5f, 9.75f, 13.16f, 9.75f, 12.75f)
                verticalLineTo(10.75f)
                horizontalLineTo(11.75f)
                curveTo(12.16f, 10.75f, 12.5f, 10.41f, 12.5f, 10.0f)
                curveTo(12.5f, 9.59f, 12.16f, 9.25f, 11.75f, 9.25f)
                close()
            }
        }
        .build()
        return _receiptadd!!
    }

private var _receiptadd: ImageVector? = null
