package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.1f)
                lineTo(7.5f, 14.7f)
                lineTo(3.0f, 12.1f)
                verticalLineTo(6.9001f)
                lineTo(7.5f, 4.3f)
                lineTo(12.0f, 6.9001f)
                verticalLineTo(8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.1f)
                lineTo(16.5f, 9.5f)
                lineTo(21.0f, 12.1f)
                verticalLineTo(17.3f)
                lineTo(16.5f, 19.9f)
                lineTo(12.0f, 17.3f)
                verticalLineTo(15.6f)
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
