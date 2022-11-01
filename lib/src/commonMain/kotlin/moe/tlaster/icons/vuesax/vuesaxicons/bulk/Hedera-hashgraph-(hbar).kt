package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.`Hedera-hashgraph-(hbar)`: ImageVector
    get() {
        if (`_hedera-hashgraph-(hbar)` != null) {
            return `_hedera-hashgraph-(hbar)`!!
        }
        `_hedera-hashgraph-(hbar)` = Builder(name = "Hedera-hashgraph-(hbar)", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 17.4001f)
                verticalLineTo(6.6001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 9.7559f)
                horizontalLineTo(16.5f)
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4996f, 18.3002f)
                curveTo(16.0076f, 18.3002f, 15.5996f, 17.8922f, 15.5996f, 17.4002f)
                verticalLineTo(6.6002f)
                curveTo(15.5996f, 6.1082f, 16.0076f, 5.7002f, 16.4996f, 5.7002f)
                curveTo(16.9916f, 5.7002f, 17.3996f, 6.1082f, 17.3996f, 6.6002f)
                verticalLineTo(17.4002f)
                curveTo(17.3996f, 17.8922f, 16.9916f, 18.3002f, 16.4996f, 18.3002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5001f, 15.1437f)
                horizontalLineTo(7.5001f)
                curveTo(7.0081f, 15.1437f, 7.6001f, 14.7357f, 7.6001f, 14.2437f)
                curveTo(7.6001f, 13.7517f, 7.0081f, 13.3438f, 7.5001f, 13.3438f)
                horizontalLineTo(16.5001f)
                curveTo(16.9921f, 13.3438f, 17.4001f, 13.7517f, 17.4001f, 14.2437f)
                curveTo(17.4001f, 14.7357f, 16.9921f, 15.1437f, 16.5001f, 15.1437f)
                close()
            }
        }
        .build()
        return `_hedera-hashgraph-(hbar)`!!
    }

private var `_hedera-hashgraph-(hbar)`: ImageVector? = null
