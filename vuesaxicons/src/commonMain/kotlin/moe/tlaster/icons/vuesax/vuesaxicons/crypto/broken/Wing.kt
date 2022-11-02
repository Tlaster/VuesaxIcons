package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Wing: ImageVector
    get() {
        if (_wing != null) {
            return _wing!!
        }
        _wing = Builder(name = "Wing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0004f, 5.0f)
                horizontalLineTo(19.5004f)
                lineTo(22.2004f, 9.7f)
                lineTo(17.0004f, 19.0f)
                lineTo(15.1504f, 15.9f)
                lineTo(18.7004f, 9.7f)
                lineTo(16.0004f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.8404f, 17.49f)
                lineTo(10.0004f, 19.0f)
                lineTo(8.1504f, 15.9f)
                lineTo(11.7004f, 9.7f)
                lineTo(9.0004f, 5.0f)
                horizontalLineTo(12.5004f)
                lineTo(15.2004f, 9.7f)
                lineTo(12.9304f, 13.77f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.8008f, 5.0f)
                horizontalLineTo(5.3008f)
                lineTo(8.0008f, 9.8f)
                lineTo(6.3008f, 12.7f)
                lineTo(1.8008f, 5.0f)
                close()
            }
        }
        .build()
        return _wing!!
    }

private var _wing: ImageVector? = null
