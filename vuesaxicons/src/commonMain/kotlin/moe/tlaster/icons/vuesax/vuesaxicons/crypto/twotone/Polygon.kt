package moe.tlaster.icons.vuesax.vuesaxicons.crypto.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.TwotoneGroup

public val TwotoneGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0998f)
                lineTo(7.5f, 14.6998f)
                lineTo(3.0f, 12.0998f)
                verticalLineTo(6.8998f)
                lineTo(7.5f, 4.2998f)
                lineTo(12.0f, 6.8998f)
                verticalLineTo(8.4698f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.1f)
                lineTo(16.5f, 9.5f)
                lineTo(21.0f, 12.1f)
                verticalLineTo(17.29f)
                lineTo(16.5f, 19.89f)
                lineTo(12.0f, 17.29f)
                verticalLineTo(15.64f)
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
