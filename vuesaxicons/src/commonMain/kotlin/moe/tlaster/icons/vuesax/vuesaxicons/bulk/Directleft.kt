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

public val BulkGroup.Directleft: ImageVector
    get() {
        if (_directleft != null) {
            return _directleft!!
        }
        _directleft = Builder(name = "Directleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2897f, 17.0198f)
                lineTo(19.5497f, 13.5398f)
                curveTo(19.0697f, 12.5698f, 19.0697f, 11.4398f, 19.5497f, 10.4698f)
                lineTo(21.2897f, 6.9898f)
                curveTo(22.7797f, 3.9998f, 19.5697f, 0.8598f, 16.6197f, 2.4198f)
                lineTo(15.0797f, 3.2398f)
                curveTo(14.8697f, 3.3498f, 14.6997f, 3.5298f, 14.5997f, 3.7498f)
                lineTo(8.8997f, 16.3898f)
                curveTo(8.6697f, 16.9098f, 8.8797f, 17.5198f, 9.3797f, 17.7798f)
                lineTo(16.6197f, 21.5898f)
                curveTo(19.5697f, 23.1498f, 22.7797f, 19.9998f, 21.2897f, 17.0198f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.6895f, 15.6f)
                lineTo(11.4195f, 7.32f)
                curveTo(11.8395f, 6.39f, 10.8395f, 5.45f, 9.9395f, 5.93f)
                lineTo(4.1695f, 8.96f)
                curveTo(1.7195f, 10.25f, 1.7195f, 13.75f, 4.1695f, 15.04f)
                lineTo(6.2095f, 16.11f)
                curveTo(6.7595f, 16.4f, 7.4295f, 16.17f, 7.6895f, 15.6f)
                close()
            }
        }
        .build()
        return _directleft!!
    }

private var _directleft: ImageVector? = null
