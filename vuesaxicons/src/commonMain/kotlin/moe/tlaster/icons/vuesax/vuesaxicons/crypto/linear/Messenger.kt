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

public val LinearGroup.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.7f, 18.4f)
                verticalLineTo(22.0f)
                lineTo(9.0f, 20.1f)
                curveTo(9.9f, 20.4f, 10.9f, 20.5f, 12.0f, 20.5f)
                curveTo(17.5f, 20.5f, 22.0f, 16.4f, 22.0f, 11.2f)
                curveTo(22.0f, 6.1f, 17.5f, 2.0f, 12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.1f, 2.0f, 11.3f)
                curveTo(2.0f, 14.2f, 3.4f, 16.7f, 5.7f, 18.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.3f, 9.2f)
                lineTo(7.5f, 13.7f)
                lineTo(11.2f, 12.8f)
                lineTo(12.7f, 13.7f)
                lineTo(16.5f, 9.2f)
                lineTo(13.0f, 10.1f)
                lineTo(11.3f, 9.2f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
