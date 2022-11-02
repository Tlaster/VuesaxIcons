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

public val BulkGroup.Frame3: ImageVector
    get() {
        if (_frame3 != null) {
            return _frame3!!
        }
        _frame3 = Builder(name = "Frame3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8f, 9.0f)
                horizontalLineTo(7.2f)
                curveTo(4.0f, 9.0f, 2.0f, 11.0f, 2.0f, 14.2f)
                verticalLineTo(16.79f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 7.2f, 22.0f)
                horizontalLineTo(16.79f)
                curveTo(19.99f, 22.0f, 21.99f, 20.0f, 21.99f, 16.8f)
                verticalLineTo(14.2f)
                curveTo(22.0f, 11.0f, 20.0f, 9.0f, 16.8f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8798f, 12.43f)
                lineTo(12.5298f, 15.78f)
                curveTo(12.2398f, 16.07f, 11.7598f, 16.07f, 11.4698f, 15.78f)
                lineTo(8.1198f, 12.43f)
                curveTo(7.8298f, 12.14f, 7.8298f, 11.66f, 8.1198f, 11.37f)
                curveTo(8.4098f, 11.08f, 8.8898f, 11.08f, 9.1798f, 11.37f)
                lineTo(11.2498f, 13.44f)
                verticalLineTo(2.75f)
                curveTo(11.2498f, 2.34f, 11.5898f, 2.0f, 11.9998f, 2.0f)
                curveTo(12.4098f, 2.0f, 12.7498f, 2.34f, 12.7498f, 2.75f)
                verticalLineTo(13.44f)
                lineTo(14.8198f, 11.37f)
                curveTo(14.9698f, 11.22f, 15.1598f, 11.15f, 15.3498f, 11.15f)
                curveTo(15.5398f, 11.15f, 15.7298f, 11.22f, 15.8798f, 11.37f)
                curveTo(16.1798f, 11.66f, 16.1798f, 12.13f, 15.8798f, 12.43f)
                close()
            }
        }
        .build()
        return _frame3!!
    }

private var _frame3: ImageVector? = null
