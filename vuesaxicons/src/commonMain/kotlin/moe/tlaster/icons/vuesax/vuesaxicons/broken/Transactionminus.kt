package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Transactionminus: ImageVector
    get() {
        if (_transactionminus != null) {
            return _transactionminus!!
        }
        _transactionminus = Builder(name = "Transactionminus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.1602f, 10.0f)
                horizontalLineTo(14.7502f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.25f, 10.0f)
                horizontalLineTo(11.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5002f, 11.0f)
                verticalLineTo(18.3f)
                curveTo(3.5002f, 20.96f, 4.9602f, 21.59f, 6.7302f, 19.69f)
                lineTo(6.7402f, 19.68f)
                curveTo(7.5602f, 18.81f, 8.8102f, 18.88f, 9.5202f, 19.83f)
                lineTo(10.5302f, 21.18f)
                curveTo(11.3402f, 22.25f, 12.6502f, 22.25f, 13.4602f, 21.18f)
                lineTo(14.4702f, 19.83f)
                curveTo(15.1902f, 18.87f, 16.4402f, 18.8f, 17.2602f, 19.68f)
                curveTo(19.0402f, 21.58f, 20.4902f, 20.95f, 20.4902f, 18.29f)
                verticalLineTo(7.04f)
                curveTo(20.4902f, 3.01f, 19.5502f, 2.0f, 15.7702f, 2.0f)
                horizontalLineTo(8.2102f)
                curveTo(4.4302f, 2.0f, 3.4902f, 3.01f, 3.4902f, 7.04f)
            }
        }
        .build()
        return _transactionminus!!
    }

private var _transactionminus: ImageVector? = null
